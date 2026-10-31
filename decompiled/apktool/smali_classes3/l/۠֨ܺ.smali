.class public final Ll/۠֨ܺ;
.super Ljava/lang/Object;
.source "KB7N"


# static fields
.field public static final ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 527
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/۠֨ܺ;->֫:Ljava/util/HashMap;

    const/16 v1, 0x190

    .line 529
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "normal"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x2bc

    .line 530
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "bold"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "lighter"

    const/4 v4, -0x1

    const/4 v5, 0x1

    const-string v6, "bolder"

    .line 0
    invoke-static {v5, v0, v6, v4, v3}, Ll/۫ۤ᩷;->֫(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    const-string v3, "200"

    const/16 v4, 0xc8

    const/16 v5, 0x64

    const-string v6, "100"

    invoke-static {v5, v0, v6, v4, v3}, Ll/۫ۤ᩷;->֫(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    const/16 v3, 0x12c

    .line 535
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "300"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "400"

    .line 536
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "600"

    const/16 v3, 0x258

    const/16 v4, 0x1f4

    const-string v5, "500"

    .line 0
    invoke-static {v4, v0, v5, v3, v1}, Ll/۫ۤ᩷;->֫(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    const-string v1, "800"

    const/16 v3, 0x320

    const-string v4, "700"

    invoke-static {v0, v4, v2, v3, v1}, Ll/ܺ۫᩷;->֫(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)V

    const/16 v1, 0x384

    .line 541
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "900"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 545
    sget-object v0, Ll/۠֨ܺ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method
