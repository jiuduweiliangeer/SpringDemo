package cdxy.demo.lession4;

import java.util.HashMap;
import java.util.Map;

public class InstancePetFactory {
    private Map<String,Pet> petMap = new HashMap<>();

    public InstancePetFactory() {
        petMap.put("erha",new Pet("erha"));
        petMap.put("jinmao",new Pet("jinmao"));
    }
    public Pet getPet(String name){
        return petMap.get(name);
    }
}
