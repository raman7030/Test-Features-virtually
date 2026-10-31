.class public final Ll/֨۬᩵;
.super Ll/ܽ᩶᩵;
.source "MAWZ"

# interfaces
.implements Ll/ܺ᩹᩵;


# static fields
.field public static final ᩹:Ll/֨۬᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 2
    new-instance v0, Ll/֨۬᩵;

    const/4 v1, 0x1

    .line 0
    invoke-direct {v0, v1}, Ll/ܽ᩶᩵;-><init>(I)V

    sput-object v0, Ll/֨۬᩵;->᩹:Ll/֨۬᩵;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 25
    check-cast p1, Ll/ᩳ᩸᩵;

    instance-of v0, p1, Ll/ܶ۬᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܶ۬᩵;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
