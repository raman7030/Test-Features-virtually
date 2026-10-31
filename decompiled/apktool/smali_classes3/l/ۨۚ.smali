.class public final Ll/ۨۚ;
.super Ljava/lang/Object;
.source "11CW"

# interfaces
.implements Landroid/view/animation/Interpolator;


# instance fields
.field public final synthetic ֫:Ll/ۡ֡;


# direct methods
.method public constructor <init>(Ll/ۡ֡;)V
    .locals 0

    .line 1398
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۚ;->֫:Ll/ۡ֡;

    return-void
.end method


# virtual methods
.method public final getInterpolation(F)F
    .locals 3

    .line 1401
    iget-object v0, p0, Ll/ۨۚ;->֫:Ll/ۡ֡;

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Ll/ۡ֡;->֫(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method
