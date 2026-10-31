.class public final Ll/᩵۫᩵;
.super Ljava/lang/Object;
.source "ZB07"

# interfaces
.implements Ll/ᩳ᩸᩵;
.implements Ll/ܿ᩸᩵;


# static fields
.field public static final ᩸:Ll/᩵۫᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/᩵۫᩵;

    .line 159
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/᩵۫᩵;->᩸:Ll/᩵۫᩵;

    return-void
.end method


# virtual methods
.method public final getKey()Ll/ܿ᩸᩵;
    .locals 0

    return-object p0
.end method

.method public final ֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;
    .locals 0

    .line 70
    invoke-interface {p2, p1, p0}, Ll/᩵᩹᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 0

    .line 159
    invoke-static {p0, p1}, Ll/ܽ᩸᩵;->֫(Ll/ᩳ᩸᩵;Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;
    .locals 1

    const-string v0, "key"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-static {p0, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 0

    .line 159
    invoke-static {p0, p1}, Ll/ܽ᩸᩵;->֫(Ll/ᩳ᩸᩵;Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    return-object p1
.end method
