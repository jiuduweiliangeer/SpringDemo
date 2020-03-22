package cdxy.demo.lession4;

import org.springframework.beans.factory.FactoryBean;

public class PetFactoryBean implements FactoryBean<Pet> {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    //返回Bean
    @Override
    public Pet getObject() throws Exception {
        return new Pet(name);
    }

    //返回Bean的类型
    @Override
    public Class<?> getObjectType() {
        return Pet.class;
    }

    //Bean是否是单例模式
    @Override
    public boolean isSingleton() {
        return true;
    }
}
