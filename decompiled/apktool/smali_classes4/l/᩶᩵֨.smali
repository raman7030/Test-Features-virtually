.class public final synthetic Ll/᩶᩵֨;
.super Ljava/lang/Object;
.source "R450"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ᩶:Ljava/util/function/Predicate;

.field public final synthetic ᩸:Ll/ۤ᩵֨;

.field public final synthetic ᩹:Ll/֨᩵֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۤ᩵֨;Ll/֨᩵֨;Ljava/util/function/Predicate;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶᩵֨;->᩸:Ll/ۤ᩵֨;

    iput-object p2, p0, Ll/᩶᩵֨;->᩹:Ll/֨᩵֨;

    iput-object p3, p0, Ll/᩶᩵֨;->᩶:Ljava/util/function/Predicate;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 573
    new-instance v0, Ll/۬᩵֨;

    iget-object v1, p0, Ll/᩶᩵֨;->᩸:Ll/ۤ᩵֨;

    iget-object v2, p0, Ll/᩶᩵֨;->᩹:Ll/֨᩵֨;

    iget-object v3, p0, Ll/᩶᩵֨;->᩶:Ljava/util/function/Predicate;

    invoke-direct {v0, v1, v2, v3}, Ll/۬᩵֨;-><init>(Ll/ۤ᩵֨;Ll/֨᩵֨;Ljava/util/function/Predicate;)V

    return-object v0
.end method
