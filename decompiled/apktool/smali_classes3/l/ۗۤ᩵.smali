.class public final Ll/ۗۤ᩵;
.super Ll/ܽ᩶᩵;
.source "GAN8"

# interfaces
.implements Ll/᩵᩹᩵;


# static fields
.field public static final ᩹:Ll/ۗۤ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 2
    new-instance v0, Ll/ۗۤ᩵;

    const/4 v1, 0x2

    .line 0
    invoke-direct {v0, v1}, Ll/ܽ᩶᩵;-><init>(I)V

    sput-object v0, Ll/ۗۤ᩵;->᩹:Ll/ۗۤ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 31
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ll/ᩳ᩸᩵;

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
