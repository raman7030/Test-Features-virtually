.class public abstract Ll/ܽۖ֡;
.super Ll/ۨܺ֡;
.source "F4MZ"

# interfaces
.implements Ll/֨ܺ֡;


# instance fields
.field public ֫:Ljava/util/regex/Matcher;

.field public ۧ:Ljava/util/regex/Pattern;

.field public ܽ:Ljava/util/regex/MatchResult;

.field public final ᩳ:Ll/ܿۖ֡;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    const-string v1, "(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)"

    .line 74
    invoke-direct {p0, v0, v1}, Ll/ܽۖ֡;->֫(ILjava/lang/String;)V

    .line 59
    new-instance v0, Ll/ܿۖ֡;

    invoke-direct {v0}, Ll/ܿۖ֡;-><init>()V

    iput-object v0, p0, Ll/ܽۖ֡;->ᩳ:Ll/ܿۖ֡;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, v0, p1}, Ll/ܽۖ֡;->֫(ILjava/lang/String;)V

    .line 47
    new-instance p1, Ll/ܿۖ֡;

    invoke-direct {p1}, Ll/ܿۖ֡;-><init>()V

    iput-object p1, p0, Ll/ܽۖ֡;->ᩳ:Ll/ܿۖ֡;

    return-void
.end method

.method private ֫(ILjava/lang/String;)V
    .locals 1

    .line 88
    :try_start_0
    invoke-static {p2, p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۖ֡;->ۧ:Ljava/util/regex/Pattern;
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 90
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unparseable regex supplied: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ܽۖ֡;->ܽ:Ljava/util/regex/MatchResult;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 132
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract ֫()Ll/ۗܺ֡;
.end method

.method public final ֫(Ll/ۗܺ֡;)V
    .locals 3

    .line 72
    iget-object v0, p0, Ll/ܽۖ֡;->ᩳ:Ll/ܿۖ֡;

    if-eqz v0, :cond_3

    .line 73
    invoke-virtual {p0}, Ll/ܽۖ֡;->֫()Ll/ۗܺ֡;

    move-result-object v1

    if-eqz p1, :cond_2

    .line 75
    invoke-virtual {p1}, Ll/ۗܺ֡;->֫()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    .line 76
    invoke-virtual {v1}, Ll/ۗܺ֡;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ۗܺ֡;->֫(Ljava/lang/String;)V

    .line 78
    :cond_0
    invoke-virtual {p1}, Ll/ۗܺ֡;->ۧ()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    .line 79
    invoke-virtual {v1}, Ll/ۗܺ֡;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۗܺ֡;->ۧ(Ljava/lang/String;)V

    .line 81
    :cond_1
    invoke-interface {v0, p1}, Ll/֨ܺ֡;->֫(Ll/ۗܺ֡;)V

    return-void

    .line 83
    :cond_2
    invoke-interface {v0, v1}, Ll/֨ܺ֡;->֫(Ll/ۗܺ֡;)V

    :cond_3
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 142
    iput-object v0, p0, Ll/ܽۖ֡;->ܽ:Ljava/util/regex/MatchResult;

    .line 143
    iget-object v0, p0, Ll/ܽۖ֡;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۖ֡;->֫:Ljava/util/regex/Matcher;

    .line 144
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 145
    iget-object p1, p0, Ll/ܽۖ֡;->֫:Ljava/util/regex/Matcher;

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->toMatchResult()Ljava/util/regex/MatchResult;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۖ֡;->ܽ:Ljava/util/regex/MatchResult;

    .line 147
    :cond_0
    iget-object p1, p0, Ll/ܽۖ֡;->ܽ:Ljava/util/regex/MatchResult;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ljava/lang/String;)Ljava/util/Calendar;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ܽۖ֡;->ᩳ:Ll/ܿۖ֡;

    invoke-virtual {v0, p1}, Ll/ܿۖ֡;->֫(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object p1

    return-object p1
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 159
    invoke-direct {p0, v0, p1}, Ll/ܽۖ֡;->֫(ILjava/lang/String;)V

    return-void
.end method
