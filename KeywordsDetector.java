public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry","The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        String check;
        String comp;
        String check1;
        int cnt=0;
        int k=0;
        int run=0;
        int save=0;
        int found=0;
        for (int i = 0; i < sentences.length; i++)
        {
            check=sentences[i];
            check1=check;
            check=check.toLowerCase();
            for(int j = 0; j < keywords.length; j++)
            {
                comp=keywords[j];
                comp=comp.toLowerCase();
                while(k<check.length()&&found==0)
                {
                    save=k;

                    while(k<check.length()&& run<comp.length()&&check.charAt(k)==comp.charAt(run))
                    {
                        cnt++;
                        k++;
                        run++;
                    }
                    if(cnt==comp.length())
                    {
                        System.out.println(check1);
                       found=1;
                    }
                    cnt=0;
                    run=0;
                    k=save+1;
                }
                k=0;
                found=0;
               
            }
        }
    }
}
