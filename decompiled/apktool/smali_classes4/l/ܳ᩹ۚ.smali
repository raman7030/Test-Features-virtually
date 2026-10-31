.class public final Ll/ܳ᩹ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# instance fields
.field public final ֫:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>(Ljava/util/regex/Pattern;)V
    .locals 0

    .line 823
    invoke-direct {p0}, Ll/᩷᩹ۚ;-><init>()V

    .line 824
    iput-object p1, p0, Ll/ܳ᩹ۚ;->֫:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 835
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ":matchesWholeText("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܳ᩹ۚ;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 0

    .line 829
    iget-object p1, p0, Ll/ܳ᩹ۚ;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {p2}, Ll/᩶֡ۚ;->ۘ֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 830
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    return p1
.end method
