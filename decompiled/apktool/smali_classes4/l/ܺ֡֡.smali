.class public final Ll/ܺ֡֡;
.super Ljava/lang/Object;
.source "37TO"

# interfaces
.implements Ll/ܿ֨֡;


# static fields
.field public static final ֫:Ll/ܰ֨֡;

.field public static final ۧ:Ljava/util/regex/Pattern;

.field public static final ܽ:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 15
    invoke-static {}, Ll/ܰ֨֡;->ۧ()Ll/᩺֨֡;

    move-result-object v0

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Ll/᩺֨֡;->֫(C)V

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ll/᩺֨֡;->֫(C)V

    invoke-virtual {v0}, Ll/᩺֨֡;->֫()Ll/ܰ֨֡;

    move-result-object v0

    sput-object v0, Ll/ܺ֡֡;->֫:Ll/ܰ֨֡;

    const-string v0, "^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$"

    .line 18
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܺ֡֡;->ܽ:Ljava/util/regex/Pattern;

    const-string v0, "^[a-zA-Z0-9.!#$%&\'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*+$"

    .line 21
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܺ֡֡;->ۧ:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩺᩵֡;)Ll/ۙ֡֡;
    .locals 5

    .line 26
    invoke-virtual {p1}, Ll/᩺᩵֡;->֫()Ll/ۢ֨֡;

    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ll/ۢ֨֡;->ۧ()V

    .line 28
    invoke-virtual {p1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v0

    const/4 v1, 0x0

    .line 213
    :goto_0
    invoke-virtual {p1}, Ll/ۢ֨֡;->ܽ()C

    move-result v2

    if-nez v2, :cond_0

    const/4 v1, -0x1

    goto :goto_1

    .line 216
    :cond_0
    sget-object v3, Ll/ܺ֡֡;->֫:Ll/ܰ֨֡;

    invoke-virtual {v3, v2}, Ll/ܰ֨֡;->֫(C)Z

    move-result v2

    if-eqz v2, :cond_5

    :goto_1
    const/4 v2, 0x0

    if-lez v1, :cond_4

    .line 30
    invoke-virtual {p1}, Ll/ۢ֨֡;->ܽ()C

    move-result v1

    const/16 v3, 0x3e

    if-eq v1, v3, :cond_1

    goto :goto_3

    .line 34
    :cond_1
    invoke-virtual {p1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;Ll/᩷֨֡;)Ll/ᩳ֨֡;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ll/ᩳ֨֡;->֫()Ljava/lang/String;

    move-result-object v1

    .line 36
    invoke-virtual {p1}, Ll/ۢ֨֡;->ۧ()V

    .line 39
    sget-object v3, Ll/ܺ֡֡;->ܽ:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v3, v1

    goto :goto_2

    .line 41
    :cond_2
    sget-object v3, Ll/ܺ֡֡;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "mailto:"

    .line 0
    invoke-static {v3, v1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_3
    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_4

    .line 46
    new-instance v4, Ll/ۖۚ֡;

    invoke-direct {v4, v3, v2}, Ll/ۖۚ֡;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    new-instance v2, Ll/۬ۚ֡;

    invoke-direct {v2, v1}, Ll/۬ۚ֡;-><init>(Ljava/lang/String;)V

    .line 48
    invoke-virtual {v0}, Ll/ᩳ֨֡;->ܽ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/֡ۚ֡;->֫(Ljava/util/List;)V

    .line 49
    invoke-virtual {v4, v2}, Ll/֡ۚ֡;->֫(Ll/֡ۚ֡;)V

    .line 50
    invoke-virtual {p1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object p1

    .line 21
    new-instance v0, Ll/ۙ֡֡;

    invoke-direct {v0, v4, p1}, Ll/ۙ֡֡;-><init>(Ll/֡ۚ֡;Ll/᩷֨֡;)V

    return-object v0

    :cond_4
    :goto_3
    return-object v2

    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 220
    invoke-virtual {p1}, Ll/ۢ֨֡;->ۧ()V

    goto :goto_0
.end method
