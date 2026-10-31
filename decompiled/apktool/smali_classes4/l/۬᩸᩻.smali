.class public final Ll/۬᩸᩻;
.super Ll/᩷ۧ᩻;
.source "C92A"


# static fields
.field public static final ܳ:Ll/۬᩸᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Ll/۬᩸᩻;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    sput-object v0, Ll/۬᩸᩻;->ܳ:Ll/۬᩸᩻;

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ᩳۜܳ;)Ll/ܶ᩵ܿ;
    .locals 3

    .line 13
    invoke-interface {p1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/data/media/"

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x2f

    const/16 v2, 0xc

    .line 16
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    .line 18
    sget-object p1, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    :cond_0
    return-object p1
.end method
