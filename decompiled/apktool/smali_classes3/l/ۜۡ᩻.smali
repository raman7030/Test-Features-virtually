.class public final Ll/ۜۡ᩻;
.super Ljava/lang/Object;
.source "TAIM"

# interfaces
.implements Ll/᩹᩸ܿ;


# instance fields
.field public final synthetic ᩸:Ll/᩷ۡ᩻;

.field public final synthetic ᩹:Ll/᩷۫ܳ;


# direct methods
.method public constructor <init>(Ll/᩷ۡ᩻;Ll/᩷۫ܳ;)V
    .locals 0

    .line 527
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۡ᩻;->᩸:Ll/᩷ۡ᩻;

    iput-object p2, p0, Ll/ۜۡ᩻;->᩹:Ll/᩷۫ܳ;

    return-void
.end method


# virtual methods
.method public final ֫(JJJJ)V
    .locals 0

    .line 530
    iget-object p3, p0, Ll/ۜۡ᩻;->᩹:Ll/᩷۫ܳ;

    invoke-virtual {p3, p1, p2}, Ll/᩷۫ܳ;->֫(J)V

    .line 531
    iget-object p1, p0, Ll/ۜۡ᩻;->᩸:Ll/᩷ۡ᩻;

    iget-object p2, p1, Ll/᩷ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {p2, p3}, Ll/֫۬ܿ;->֫(Ll/᩷۫ܳ;)V

    .line 532
    iget-object p2, p1, Ll/᩷ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {p2, p7, p8}, Ll/֫۬ܿ;->֫(J)V

    .line 533
    iget-object p1, p1, Ll/᩷ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {p3}, Ll/᩷۫ܳ;->ܽ()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/֫۬ܿ;->֫(I)V

    return-void
.end method

.method public final ܺ֫()Ll/ۙ֡ܿ;
    .locals 1

    .line 539
    iget-object v0, p0, Ll/ۜۡ᩻;->᩸:Ll/᩷ۡ᩻;

    iget-object v0, v0, Ll/᩷ۡ᩻;->ۜ:Ll/ۙ֡ܿ;

    return-object v0
.end method

.method public final synthetic ᩷֫()V
    .locals 0

    return-void
.end method

.method public final ᩻()Z
    .locals 2

    .line 510
    iget-object v0, p0, Ll/ۜۡ᩻;->᩸:Ll/᩷ۡ᩻;

    iget-object v1, v0, Ll/᩷ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {v1}, Ll/֫۬ܿ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Ll/᩷ۡ᩻;->ۡ:Ll/۟ۢ֫;

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
