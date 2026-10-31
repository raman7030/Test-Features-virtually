.class public final Ll/ۜ᩹ۡ;
.super Ljava/lang/Object;
.source "E971"


# static fields
.field public static final ֫:Ll/ۨۘܽ;

.field public static final ۧ:Ll/ۨۘܽ;

.field public static final ܽ:Ljava/util/Set;

.field public static final ᩳ:Ll/ۨۘܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "^\\w+\\S+(\\.\\S+)+$"

    .line 15
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۜ᩹ۡ;->ᩳ:Ll/ۨۘܽ;

    const-string v0, "\\w+://.+"

    .line 17
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۜ᩹ۡ;->֫:Ll/ۨۘܽ;

    const-string v0, "\\.([a-z][a-z0-9]*)$"

    const/4 v1, 0x2

    .line 18
    invoke-static {v1, v0}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۜ᩹ۡ;->ۧ:Ll/ۨۘܽ;

    const-string v0, "ac ad ae af ag ai al am ao aq ar as at au aw ax az ba bb bd be bf bg bh bi bj bm bn bo bq br bs bt bw by bz ca cc cd cf cg ch ci ck cl cm cn co cr cu cv cw cx cy cz de dj dk dm do dz ec ee eg er es et eu fi fj fk fm fo fr ga gd ge gf gg gh gi gl gm gn gp gq gr gs gt gu gw gy hk hm hn hr ht hu id ie il im in io iq ir is it je jm jo jp ke kg kh ki km kn kp kr kw ky kz la lb lc li lk lr ls lt lu lv ly ma mc md me mg mh mk ml mm mn mo mp mq mr ms mt mu mv mw mx my mz na nc ne nf ng ni nl no np nr nu nz om pa pe pf pg ph pk pl pm pn pr ps pt pw py qa re ro rs ru rw sa sb sc sd se sg sh si sj sk sl sm sn so sr st sv sy sz tc td tf tg th tj tk tl tm tn to tr tt tv tw tz ua ug uk us uy uz va vc ve vg vi vn vu wf ws ye yt za zm zw app art bar bet bid bio biz car cat ceo com dev dog eat eco edu fan fly foo geo gov how ice ink int kim lol ltd mba men mil net now org pro pub red run sex ski tax tel top uno vet web win wtf xxx aero army arpa asia auto baby band bank beer best bike blog blue book buzz cafe camp care cars casa cash chat city club cool coop fail farm fast fish food fund game gift gold golf guru hair haus help host info jobs land lgbt life limo link live loan love mail menu mobi moda name news pics pink plus porn post real rent rich sale save sexy shop show site taxi team tech tips town toys vote wiki wine work yoga zone actor adult autos bingo black boats build cheap click cloud coach codes dance deals earth email faith forex forum gifts gives glass green gripe group guide homes horse hotel house irish jetzt lease legal loans media miami money movie music ninja parts party photo pizza place poker press rehab rocks salon shoes solar space sport store style sucks tires today tools tours trade vegas video vodka watch works world africa agency beauty berlin boston camera career casino center church claims clinic coffee condos credit cruise dating degree dental design direct doctor energy estate events expert family flight futbol garden global gratis health hiphop hockey kaufen lawyer london luxury maison market mobile museum online photos racing reisen repair report review school soccer social sports studio supply tennis travel villas vision voyage academy auction capital college company cooking country coupons courses cricket digital domains exposed express fashion finance fitness flights florist flowers forsale gallery guitars hamburg holiday hosting jewelry kitchen limited markets medical network organic recipes rentals reviews science singles support surgery systems theater theatre website wedding airforce attorney bargains boutique builders business catering cleaning clothing computer creative delivery diamonds discount download engineer exchange feedback football gambling graphics holdings hospital lighting memorial mortgage partners pictures plumbing property services shopping software supplies training ventures amsterdam community directory education equipment financial furniture institute insurance marketing solutions vacations accountant apartments associates consulting foundation healthcare industries management properties republican restaurant technology university advertising contractors engineering enterprises investments photography productions construction international"

    const-string v1, " "

    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 68
    new-instance v1, Ljava/util/HashSet;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 69
    invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 70
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ۜ᩹ۡ;->ܽ:Ljava/util/Set;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 105
    sget-object v0, Ll/ۜ᩹ۡ;->֫:Ll/ۨۘܽ;

    invoke-virtual {v0, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ۘܽ;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "http://"

    .line 0
    invoke-static {v0, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ֫(Ll/۟᩸ᩳ;II)Z
    .locals 2

    sub-int v0, p2, p1

    const/16 v1, 0x800

    if-le v0, v1, :cond_0

    goto :goto_1

    .line 77
    :cond_0
    sget-object v0, Ll/ۜ᩹ۡ;->ᩳ:Ll/ۨۘܽ;

    invoke-virtual {v0, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/۫ۘܽ;->region(II)V

    invoke-virtual {v0}, Ll/۫ۘܽ;->matches()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 26
    invoke-virtual {p0, p1, p2}, Ll/۟᩸ᩳ;->subSequence(II)Ljava/lang/String;

    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p0

    .line 79
    invoke-static {p0}, Ll/ۜ᩹ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 81
    :try_start_0
    new-instance p2, Ljava/net/URL;

    invoke-direct {p2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    const-string p2, "."

    .line 82
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_4

    const-string p2, "-"

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string p2, "http://"

    .line 87
    invoke-virtual {p0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    const/4 v0, 0x1

    if-nez p2, :cond_3

    const-string p2, "https://"

    invoke-virtual {p0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    .line 91
    :cond_2
    sget-object p0, Ll/ۜ᩹ۡ;->ۧ:Ll/ۨۘܽ;

    invoke-virtual {p0, p1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 93
    invoke-virtual {p0, v0}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    sget-object p1, Ll/ۜ᩹ۡ;->ܽ:Ljava/util/Set;

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :cond_3
    :goto_0
    return v0

    :catch_0
    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0
.end method
