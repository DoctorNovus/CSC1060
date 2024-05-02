public class DataBuilder {
    public static void main(String[] args) {
        String data = """
        Alabama Montgomery
        Alaska Juneau
        Arizona Phoenix
        Arkansas Little Rock
        California Sacramento
        Colorado Denver
        Connecticut Hartford
        Delaware Dover
        Florida Tallahassee
        Georgia Atlanta
        Hawaii Honolulu
        Idaho Boise
        Illinois Springfield
        Indiana Indianapolis
        Iowa Des Moines
        Kansas Topeka
        Kentucky Frankfort
        Louisiana Baton Rouge
        Maine Augusta
        Maryland Annapolis
        Massachusetts Boston
        Michigan Lansing
        Minnesota St. Paul
        Mississippi Jackson
        Missouri Jefferson City
        Montana Helena
        Nebraska Lincoln
        Nevada Carson City
        New Hampshire Concord
        New Jersey Trenton
        New Mexico Santa Fe
        New York Albany
        North Carolina Raleigh
        North Dakota Bismarck
        Ohio Columbus
        Oklahoma Oklahoma City
        Oregon Salem
        Pennsylvania Harrisburg
        Rhode Island Providence
        South Carolina Columbia
        South Dakota Pierre
        Tennessee Nashville
        Texas Austin
        Utah Salt Lake City
        Vermont Montpelier
        Virginia Richmond
        Washington Olympia
        West Virginia Charleston
        Wisconsin Madison
        Wyoming Cheyenne
        """;

        for(String set: data.split("\n")){
            String[] setBase = set.split(" ");
            String state = setBase[0];
            String capital = setBase[1];

            System.out.println(String.format("new StateBuilder(\"%s\", \"%s\"),", state, capital));
        }
    }
}
