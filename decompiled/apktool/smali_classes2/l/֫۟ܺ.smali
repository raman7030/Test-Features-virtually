.class public final synthetic Ll/֫۟ܺ;
.super Ljava/lang/Object;
.source "E7PV"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    sget-object v0, Ll/ۧ۟ܺ;->֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ll/ܶ۟ܺ;)Ll/ܽ۫ᩴ;
    .locals 2

    .line 38
    invoke-interface {p0}, Ll/ܶ۟ܺ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object p0

    return-object p0

    .line 41
    :cond_0
    sget-object v0, Ll/ۧ۟ܺ;->֫:Ljava/util/regex/Pattern;

    invoke-interface {p0}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    .line 43
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v0, 0x1

    .line 45
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "/* "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "= */"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object p0

    return-object p0
.end method
