import java.util.stream.Collectors;

public class DnaStrand {

    public static String makeComplement(String dna) {
        return dna.chars()
                .mapToObj(c -> {
                    switch (c) {
                        case 'A': return 'T';
                        case 'T': return 'A';
                        case 'C': return 'G';
                        case 'G': return 'C';
                        default: return (char)c;
                    }
                })
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}

