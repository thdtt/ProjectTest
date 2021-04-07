package opencart.ZParser.Model;

import java.util.List;

public class Method extends NamedEntity {
    private List<String> parameters;

    public Method(String type, String name, List<String> status, List<String> parameters) {
        super.setType(type);
        super.setName(name);
        super.setModifiers(status);
        this.parameters = parameters;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public void addParameters(String parameter) {
        parameters.add(parameter);
    }

}
