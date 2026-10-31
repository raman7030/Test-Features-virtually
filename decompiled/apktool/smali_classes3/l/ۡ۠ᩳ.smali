.class public final synthetic Ll/ۡ۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ll/᩺᩵᩷;
.implements Ll/᩶ۤۡ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡ۠ᩳ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic onCanceled()V
    .locals 0

    return-void
.end method

.method public ֫(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۡ۠ᩳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/۫ۨᩳ;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ۘ(I)V

    return-void
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ۡ۠ᩳ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩹ܶᩳ;

    .line 1859
    new-instance v1, Ll/ۙܶᩳ;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {p1, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/ۙܶᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 402
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p1

    check-cast p1, Ll/ܽ֨ᩳ;

    .line 1861
    new-instance v2, Ll/۬۠ᩳ;

    invoke-direct {v2, v0, p1, v1}, Ll/۬۠ᩳ;-><init>(Ll/᩹ܶᩳ;Ll/ܽ֨ᩳ;Ll/ۙܶᩳ;)V

    .line 1892
    invoke-virtual {v2}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
