.class public final enum Ll/ۨ᩸ܺ;
.super Ll/ܰ᩸ܺ;
.source "E3QI"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 532
    invoke-direct {p0, p1, p2, v0}, Ll/ܰ᩸ܺ;-><init>(Ljava/lang/String;ILl/ۚ᩸ܺ;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۘ᩹ܺ;Ljava/lang/Object;ILl/᩻᩶ܺ;)Ll/᩻᩶ܺ;
    .locals 1

    .line 536
    new-instance v0, Ll/᩺᩹ܺ;

    iget-object p1, p1, Ll/ۘ᩹ܺ;->᩶:Ljava/lang/ref/ReferenceQueue;

    .line 1341
    invoke-direct {v0, p3, p4, p2, p1}, Ll/ۛ᩹ܺ;-><init>(ILl/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    const-wide p1, 0x7fffffffffffffffL

    .line 1346
    iput-wide p1, v0, Ll/᩺᩹ܺ;->۬:J

    .line 919
    sget-object p1, Ll/ܺ᩹ܺ;->᩹:Ll/ܺ᩹ܺ;

    .line 1359
    iput-object p1, v0, Ll/᩺᩹ܺ;->ۙ:Ll/᩻᩶ܺ;

    .line 1372
    iput-object p1, v0, Ll/᩺᩹ܺ;->ۗ:Ll/᩻᩶ܺ;

    return-object v0
.end method

.method public ֫(Ll/ۘ᩹ܺ;Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;Ljava/lang/Object;)Ll/᩻᩶ܺ;
    .locals 0

    .line 545
    invoke-super {p0, p1, p2, p3, p4}, Ll/ܰ᩸ܺ;->֫(Ll/ۘ᩹ܺ;Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;Ljava/lang/Object;)Ll/᩻᩶ܺ;

    move-result-object p1

    .line 546
    invoke-virtual {p0, p2, p1}, Ll/ܰ᩸ܺ;->ۧ(Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;)V

    return-object p1
.end method
