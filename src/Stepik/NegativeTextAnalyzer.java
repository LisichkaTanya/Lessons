package Stepik;

class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] KEYWORDS = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return KEYWORDS;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
