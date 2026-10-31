.class public final Ll/᩹ۗ֡;
.super Ljava/lang/Object;
.source "Y5QT"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 238
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 53
    sput-object v0, Ll/᩹ۗ֡;->ۧ:Ljava/util/HashMap;

    const-string v1, "no-such-class"

    const/4 v2, 0x2

    const/4 v3, 0x1

    const-string v4, "generic-error"

    .line 0
    invoke-static {v3, v0, v4, v2, v1}, Ll/۫ۤ᩷;->֫(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    const-string v1, "no-such-method"

    const/4 v2, 0x4

    const/4 v3, 0x3

    const-string v4, "no-such-field"

    invoke-static {v3, v0, v4, v2, v1}, Ll/۫ۤ᩷;->֫(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    const-string v1, "illegal-field-access"

    const/4 v2, 0x6

    const/4 v3, 0x5

    const-string v4, "illegal-class-access"

    invoke-static {v3, v0, v4, v2, v1}, Ll/۫ۤ᩷;->֫(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    const-string v1, "class-change-error"

    const/16 v2, 0x8

    const/4 v3, 0x7

    const-string v4, "illegal-method-access"

    invoke-static {v3, v0, v4, v2, v1}, Ll/۫ۤ᩷;->֫(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    const/16 v1, 0x9

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "instantiation-error"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 3

    .line 94
    sget-object v0, Ll/᩹ۗ֡;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 98
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 96
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x0

    const-string v2, "Invalid verification error: %s"

    .line 46
    invoke-direct {v0, p0, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    throw v0
.end method
