.class public final synthetic Ll/᩶ۧܿ;
.super Ljava/lang/Object;
.source "35OM"

# interfaces
.implements Ljava/util/function/BooleanSupplier;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:Ll/۟᩺ᩳ;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ܿܽܿ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ܿܽܿ;IILl/۟᩺ᩳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۧܿ;->᩸:Ll/ܿܽܿ;

    iput p2, p0, Ll/᩶ۧܿ;->᩹:I

    iput p3, p0, Ll/᩶ۧܿ;->᩶:I

    iput-object p4, p0, Ll/᩶ۧܿ;->ۙ:Ll/۟᩺ᩳ;

    iput p5, p0, Ll/᩶ۧܿ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final getAsBoolean()Z
    .locals 5

    .line 0
    iget-object v0, p0, Ll/᩶ۧܿ;->ۙ:Ll/۟᩺ᩳ;

    iget v1, p0, Ll/᩶ۧܿ;->ۗ:I

    iget-object v2, p0, Ll/᩶ۧܿ;->᩸:Ll/ܿܽܿ;

    iget v3, p0, Ll/᩶ۧܿ;->᩹:I

    iget v4, p0, Ll/᩶ۧܿ;->᩶:I

    invoke-static {v2, v3, v4, v0, v1}, Ll/ܿܽܿ;->֫(Ll/ܿܽܿ;IILl/۟᩺ᩳ;I)Z

    move-result v0

    return v0
.end method
