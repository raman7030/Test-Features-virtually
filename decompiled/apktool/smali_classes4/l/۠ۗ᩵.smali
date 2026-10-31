.class public final Ll/۠ۗ᩵;
.super Ll/ܽ᩶᩵;
.source "ZB07"

# interfaces
.implements Ll/᩵᩹᩵;


# static fields
.field public static final ᩹:Ll/۠ۗ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 2
    new-instance v0, Ll/۠ۗ᩵;

    const/4 v1, 0x2

    .line 0
    invoke-direct {v0, v1}, Ll/ܽ᩶᩵;-><init>(I)V

    sput-object v0, Ll/۠ۗ᩵;->᩹:Ll/۠ۗ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 80
    check-cast p1, Ll/ܳ᩸᩵;

    check-cast p2, Ll/ᩳ᩸᩵;

    .line 82
    instance-of v0, p2, Ll/֨ۗ᩵;

    if-eqz v0, :cond_0

    .line 83
    check-cast p2, Ll/֨ۗ᩵;

    invoke-interface {p2}, Ll/֨ۗ᩵;->ܳ()Ll/֨ۗ᩵;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/ܳ᩸᩵;->֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    return-object p1

    .line 85
    :cond_0
    invoke-interface {p1, p2}, Ll/ܳ᩸᩵;->֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    return-object p1
.end method
