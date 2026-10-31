package l;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩵ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5JO */
/* JADX INFO: loaded from: classes5.dex */
public final class C19166 extends C18460 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f60394 = Pattern.compile("(.*?);([0-9]{1,20})\\s{0,80}.{0,80}");

    @Override // l.AbstractC11795, l.InterfaceC6150
    /* JADX INFO: renamed from: ֫ */
    public final List mo11132(LinkedList linkedList) {
        Pattern pattern;
        HashMap map = new HashMap();
        ListIterator listIterator = linkedList.listIterator();
        while (true) {
            boolean zHasNext = listIterator.hasNext();
            pattern = f60394;
            if (!zHasNext) {
                break;
            }
            Matcher matcher = pattern.matcher(((String) listIterator.next()).trim());
            if (matcher.matches()) {
                MatchResult matchResult = matcher.toMatchResult();
                String strGroup = matchResult.group(1);
                Integer numValueOf = Integer.valueOf(matchResult.group(2));
                Integer num = (Integer) map.get(strGroup);
                if (num != null && numValueOf.intValue() < num.intValue()) {
                    listIterator.remove();
                } else {
                    map.put(strGroup, numValueOf);
                }
            }
        }
        while (listIterator.hasPrevious()) {
            Matcher matcher2 = pattern.matcher(((String) listIterator.previous()).trim());
            if (matcher2.matches()) {
                MatchResult matchResult2 = matcher2.toMatchResult();
                String strGroup2 = matchResult2.group(1);
                int i = Integer.parseInt(matchResult2.group(2));
                Integer num2 = (Integer) map.get(strGroup2);
                if (num2 != null && i < num2.intValue()) {
                    listIterator.remove();
                }
            }
        }
        return linkedList;
    }
}
