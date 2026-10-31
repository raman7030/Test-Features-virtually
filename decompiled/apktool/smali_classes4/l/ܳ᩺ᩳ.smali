.class public final synthetic Ll/ܳ᩺ᩳ;
.super Ljava/lang/Object;
.source "G4ML"

# interfaces
.implements Ljava/util/function/BooleanSupplier;


# instance fields
.field public final synthetic ۗ:Ljava/lang/String;

.field public final synthetic ۙ:Ll/۬۟ᩳ;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ܶ᩺ᩳ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩺ᩳ;Ljava/lang/String;ILl/۬۟ᩳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ᩺ᩳ;->᩸:Ll/ܶ᩺ᩳ;

    iput-object p2, p0, Ll/ܳ᩺ᩳ;->᩹:Ljava/lang/String;

    iput p3, p0, Ll/ܳ᩺ᩳ;->᩶:I

    iput-object p4, p0, Ll/ܳ᩺ᩳ;->ۙ:Ll/۬۟ᩳ;

    iput-object p5, p0, Ll/ܳ᩺ᩳ;->ۗ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getAsBoolean()Z
    .locals 5

    .line 0
    iget-object v0, p0, Ll/ܳ᩺ᩳ;->ۙ:Ll/۬۟ᩳ;

    iget-object v1, p0, Ll/ܳ᩺ᩳ;->ۗ:Ljava/lang/String;

    iget-object v2, p0, Ll/ܳ᩺ᩳ;->᩸:Ll/ܶ᩺ᩳ;

    iget-object v3, p0, Ll/ܳ᩺ᩳ;->᩹:Ljava/lang/String;

    iget v4, p0, Ll/ܳ᩺ᩳ;->᩶:I

    invoke-static {v2, v3, v4, v0, v1}, Ll/ܶ᩺ᩳ;->֫(Ll/ܶ᩺ᩳ;Ljava/lang/String;ILl/۬۟ᩳ;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
