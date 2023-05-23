public class Main {
    public static void main(String[] args) {
        EvidenceAut evidence = new EvidenceAut();

        evidence.add(new Auto(5));
        evidence.add(new Dodavka(5, 300));

        System.out.println(evidence.size());

        try {
            evidence.get(0).pridejPasazery(2);
        } catch (AutoException e) {
            System.err.println(e.getLocalizedMessage());
        }

        for (Auto auto : evidence) {
            System.out.println(auto);
        }

        evidence.clear();
        System.out.println(evidence.size());

    }
}
