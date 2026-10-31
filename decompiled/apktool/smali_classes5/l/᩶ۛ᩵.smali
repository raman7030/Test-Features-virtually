.class public final Ll/᩶ۛ᩵;
.super Ll/ܽ᩶᩵;
.source "BAYE"

# interfaces
.implements Ll/᩵᩹᩵;


# static fields
.field public static final ᩹:Ll/᩶ۛ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 2
    new-instance v0, Ll/᩶ۛ᩵;

    const/4 v1, 0x2

    .line 0
    invoke-direct {v0, v1}, Ll/ܽ᩶᩵;-><init>(I)V

    sput-object v0, Ll/᩶ۛ᩵;->᩹:Ll/᩶ۛ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 35
    check-cast p2, Ll/ᩳ᩸᩵;

    .line 36
    instance-of v0, p2, Ll/ܺ۫᩵;

    if-eqz v0, :cond_3

    .line 37
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    :goto_1
    if-nez p1, :cond_2

    return-object p2

    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 38
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_3
    return-object p1
.end method
