.class public final synthetic Ll/֨ۗᩳ;
.super Ljava/lang/Object;
.source "I6U1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:J

.field public final synthetic ۙ:Ll/᩺ۗᩳ;

.field public final synthetic ۬:J

.field public final synthetic ᩶:Ll/ܶۙᩳ;

.field public final synthetic ᩸:Ll/᩻۬ᩳ;

.field public final synthetic ᩹:Ljava/util/function/BooleanSupplier;


# direct methods
.method public synthetic constructor <init>(Ll/᩻۬ᩳ;Ljava/util/function/BooleanSupplier;Ll/ܶۙᩳ;Ll/᩺ۗᩳ;JJ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۗᩳ;->᩸:Ll/᩻۬ᩳ;

    iput-object p2, p0, Ll/֨ۗᩳ;->᩹:Ljava/util/function/BooleanSupplier;

    iput-object p3, p0, Ll/֨ۗᩳ;->᩶:Ll/ܶۙᩳ;

    iput-object p4, p0, Ll/֨ۗᩳ;->ۙ:Ll/᩺ۗᩳ;

    iput-wide p5, p0, Ll/֨ۗᩳ;->ۗ:J

    iput-wide p7, p0, Ll/֨ۗᩳ;->۬:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 0
    iget-wide v4, p0, Ll/֨ۗᩳ;->ۗ:J

    iget-wide v6, p0, Ll/֨ۗᩳ;->۬:J

    iget-object v0, p0, Ll/֨ۗᩳ;->᩸:Ll/᩻۬ᩳ;

    iget-object v1, p0, Ll/֨ۗᩳ;->᩹:Ljava/util/function/BooleanSupplier;

    iget-object v2, p0, Ll/֨ۗᩳ;->᩶:Ll/ܶۙᩳ;

    iget-object v3, p0, Ll/֨ۗᩳ;->ۙ:Ll/᩺ۗᩳ;

    invoke-static/range {v0 .. v7}, Ll/᩻۬ᩳ;->֫(Ll/᩻۬ᩳ;Ljava/util/function/BooleanSupplier;Ll/ܶۙᩳ;Ll/᩺ۗᩳ;JJ)V

    return-void
.end method
