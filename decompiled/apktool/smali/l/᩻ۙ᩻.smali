.class public final synthetic Ll/᩻ۙ᩻;
.super Ljava/lang/Object;
.source "75VW"

# interfaces
.implements Ll/֫۠ܳ;


# instance fields
.field public final synthetic ᩸:Ll/ܺۙ᩻;

.field public final synthetic ᩹:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ll/ܺۙ᩻;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۙ᩻;->᩸:Ll/ܺۙ᩻;

    iput-object p2, p0, Ll/᩻ۙ᩻;->᩹:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/widget/TextView;)V
    .locals 4

    .line 160
    iget-object v0, p0, Ll/᩻ۙ᩻;->᩸:Ll/ܺۙ᩻;

    iget-object v1, v0, Ll/ܺۙ᩻;->֫:Ll/ܳ۠ܳ;

    new-instance v2, Ll/ۡۙ᩻;

    iget-object v3, p0, Ll/᩻ۙ᩻;->᩹:Ljava/util/List;

    invoke-direct {v2, v0, v3, p1}, Ll/ۡۙ᩻;-><init>(Ll/ܺۙ᩻;Ljava/util/List;Landroid/widget/TextView;)V

    const p1, 0x7f1207b2

    invoke-virtual {v1, p1, v2}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    return-void
.end method
