.class public final synthetic Ll/ܿܰᩳ;
.super Ljava/lang/Object;
.source "Q5YY"

# interfaces
.implements Ljava/util/function/BooleanSupplier;


# instance fields
.field public final synthetic ۗ:Ll/ۤܽᩴ;

.field public final synthetic ۙ:Ll/᩷۟ᩳ;

.field public final synthetic ۬:I

.field public final synthetic ᩶:Ll/۟᩺ᩳ;

.field public final synthetic ᩸:Ll/ۖܰᩳ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ۖܰᩳ;ILl/۟᩺ᩳ;Ll/᩷۟ᩳ;Ll/ۤܽᩴ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܰᩳ;->᩸:Ll/ۖܰᩳ;

    iput p2, p0, Ll/ܿܰᩳ;->᩹:I

    iput-object p3, p0, Ll/ܿܰᩳ;->᩶:Ll/۟᩺ᩳ;

    iput-object p4, p0, Ll/ܿܰᩳ;->ۙ:Ll/᩷۟ᩳ;

    iput-object p5, p0, Ll/ܿܰᩳ;->ۗ:Ll/ۤܽᩴ;

    iput p6, p0, Ll/ܿܰᩳ;->۬:I

    return-void
.end method


# virtual methods
.method public final getAsBoolean()Z
    .locals 6

    .line 0
    iget-object v4, p0, Ll/ܿܰᩳ;->ۗ:Ll/ۤܽᩴ;

    iget v5, p0, Ll/ܿܰᩳ;->۬:I

    iget-object v0, p0, Ll/ܿܰᩳ;->᩸:Ll/ۖܰᩳ;

    iget v1, p0, Ll/ܿܰᩳ;->᩹:I

    iget-object v2, p0, Ll/ܿܰᩳ;->᩶:Ll/۟᩺ᩳ;

    iget-object v3, p0, Ll/ܿܰᩳ;->ۙ:Ll/᩷۟ᩳ;

    invoke-static/range {v0 .. v5}, Ll/ۖܰᩳ;->֫(Ll/ۖܰᩳ;ILl/۟᩺ᩳ;Ll/᩷۟ᩳ;Ll/ۤܽᩴ;I)Z

    move-result v0

    return v0
.end method
