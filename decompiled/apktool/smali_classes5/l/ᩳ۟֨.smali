.class public final synthetic Ll/ᩳ۟֨;
.super Ljava/lang/Object;
.source "57L9"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ۗ:[I

.field public final synthetic ۙ:Ll/ܶ۟֨;

.field public final synthetic ᩶:Ll/ܶ۟֨;

.field public final synthetic ᩸:Ll/ܳ۟֨;

.field public final synthetic ᩹:Ll/ܶ۟֨;


# direct methods
.method public synthetic constructor <init>(Ll/ܳ۟֨;Ll/ܶ۟֨;Ll/ܶ۟֨;Ll/ܶ۟֨;[I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ۟֨;->᩸:Ll/ܳ۟֨;

    iput-object p2, p0, Ll/ᩳ۟֨;->᩹:Ll/ܶ۟֨;

    iput-object p3, p0, Ll/ᩳ۟֨;->᩶:Ll/ܶ۟֨;

    iput-object p4, p0, Ll/ᩳ۟֨;->ۙ:Ll/ܶ۟֨;

    iput-object p5, p0, Ll/ᩳ۟֨;->ۗ:[I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 375
    iget-object v0, p0, Ll/ᩳ۟֨;->᩸:Ll/ܳ۟֨;

    iget-object v1, v0, Ll/ܳ۟֨;->ۗ:Ll/ۤ۟֨;

    iget-object v0, v0, Ll/ܺ۟֨;->᩹:Ll/ۤܶ۠;

    iget-object v2, p0, Ll/ᩳ۟֨;->᩹:Ll/ܶ۟֨;

    iget-object v3, p0, Ll/ᩳ۟֨;->᩶:Ll/ܶ۟֨;

    invoke-static {v2, v3}, Ll/ۖܶ۠;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v2

    iget-object v3, p0, Ll/ᩳ۟֨;->ۙ:Ll/ܶ۟֨;

    iget-object v4, p0, Ll/ᩳ۟֨;->ۗ:[I

    invoke-static {v1, v0, v2, v3, v4}, Ll/ۤ۟֨;->֫(Ll/ۤ۟֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ܶ۟֨;[I)Ll/֨֡֨;

    move-result-object v0

    return-object v0
.end method
