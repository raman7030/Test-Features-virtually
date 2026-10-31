.class public final Ll/᩸ۗ᩵;
.super Ll/ܽ᩶᩵;
.source "ZB07"

# interfaces
.implements Ll/᩵᩹᩵;


# static fields
.field public static final ᩹:Ll/᩸ۗ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 2
    new-instance v0, Ll/᩸ۗ᩵;

    const/4 v1, 0x2

    .line 0
    invoke-direct {v0, v1}, Ll/ܽ᩶᩵;-><init>(I)V

    sput-object v0, Ll/᩸ۗ᩵;->᩹:Ll/᩸ۗ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 40
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ll/ᩳ᩸᩵;

    if-nez p1, :cond_1

    instance-of p1, p2, Ll/֨ۗ᩵;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
