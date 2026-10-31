.class public final synthetic Ll/ۛۗᩳ;
.super Ljava/lang/Object;
.source "I6U1"

# interfaces
.implements Ll/ۗۙᩳ;


# instance fields
.field public final synthetic ֫:Ll/᩻۬ᩳ;

.field public final synthetic ۧ:Ljava/util/function/BooleanSupplier;

.field public final synthetic ܽ:Ll/᩺ۗᩳ;

.field public final synthetic ᩳ:Ll/᩶۫᩷;


# direct methods
.method public synthetic constructor <init>(Ll/᩻۬ᩳ;Ljava/util/function/BooleanSupplier;Ll/᩺ۗᩳ;Ll/᩶۫᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛۗᩳ;->֫:Ll/᩻۬ᩳ;

    iput-object p2, p0, Ll/ۛۗᩳ;->ۧ:Ljava/util/function/BooleanSupplier;

    iput-object p3, p0, Ll/ۛۗᩳ;->ܽ:Ll/᩺ۗᩳ;

    iput-object p4, p0, Ll/ۛۗᩳ;->ᩳ:Ll/᩶۫᩷;

    return-void
.end method


# virtual methods
.method public final run()J
    .locals 4

    .line 0
    iget-object v0, p0, Ll/ۛۗᩳ;->ܽ:Ll/᩺ۗᩳ;

    iget-object v1, p0, Ll/ۛۗᩳ;->ᩳ:Ll/᩶۫᩷;

    iget-object v2, p0, Ll/ۛۗᩳ;->֫:Ll/᩻۬ᩳ;

    iget-object v3, p0, Ll/ۛۗᩳ;->ۧ:Ljava/util/function/BooleanSupplier;

    invoke-static {v2, v3, v0, v1}, Ll/᩻۬ᩳ;->֫(Ll/᩻۬ᩳ;Ljava/util/function/BooleanSupplier;Ll/᩺ۗᩳ;Ll/᩶۫᩷;)J

    move-result-wide v0

    return-wide v0
.end method
