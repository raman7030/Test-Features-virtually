.class public final Ll/᩵᩸ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 715
    invoke-direct {p0}, Ll/᩷᩹ۚ;-><init>()V

    .line 716
    iput-object p1, p0, Ll/᩵᩸ۚ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, ":containsWholeOwnText("

    const-string v1, ")"

    .line 0
    iget-object v2, p0, Ll/᩵᩸ۚ;->֫:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 0

    .line 721
    invoke-virtual {p2}, Ll/᩶֡ۚ;->ۖ֫()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/᩵᩸ۚ;->֫:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method
