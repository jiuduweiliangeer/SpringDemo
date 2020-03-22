package cdxy.demo.lession4;

import java.util.HashMap;
import java.util.Map;

public class StaticPetFactory {
    private static Map<String,Pet> petMap = new HashMap<>();
    static {
        petMap.put("erha",new Pet("erha"));
        petMap.put("jinmao",new Pet("jinmao"));
    }
    public static Pet getPet(String name){
        return petMap.get(name);
    }
}
