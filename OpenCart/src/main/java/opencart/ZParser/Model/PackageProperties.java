package opencart.ZParser.Model;

import java.util.HashSet;
import java.util.Set;

public class PackageProperties {
    private Set<ClassProperties> classPropertiesSet = new HashSet<>();

    public PackageProperties() {
    }

    public PackageProperties(Set<ClassProperties> classPropertiesSet) {
        this.classPropertiesSet = classPropertiesSet;
    }

    public Set<ClassProperties> getClassPropertiesSet() {
        return classPropertiesSet;
    }

    public void setClassPropertiesSet(Set<ClassProperties> classPropertiesSet) {
        this.classPropertiesSet = classPropertiesSet;
    }

    public void addClassProperty(ClassProperties classProperties) {
        classPropertiesSet.add(classProperties);
    }
}
