package org.codeontology.docparser;


public class TagFactory {
    private static TagFactory instance;

    private TagFactory() {

    }

    public static TagFactory getInstance() {
        if (instance == null) {
            instance = new TagFactory();
        }

        return instance;
    }

    public Tag createTag(String name, String text) {
        switch (name) {
            case ParamTag.TAG:
                return new ParamTag(text);
            case ReturnTag.TAG:
                return new ReturnTag(text);
            default:
                return new Tag(name, text);
        }
    }
}