.class public final Ll/֡֨ܺ;
.super Ljava/lang/Object;
.source "KB7N"


# static fields
.field public static final ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 550
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/֡֨ܺ;->֫:Ljava/util/HashMap;

    const-string v1, "none"

    .line 552
    sget-object v2, Ll/֫֡ܺ;->᩹:Ll/֫֡ܺ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "xMinYMin"

    .line 553
    sget-object v2, Ll/֫֡ܺ;->᩺:Ll/֫֡ܺ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "xMidYMin"

    .line 554
    sget-object v2, Ll/֫֡ܺ;->ۤ:Ll/֫֡ܺ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "xMaxYMin"

    .line 555
    sget-object v2, Ll/֫֡ܺ;->ۗ:Ll/֫֡ܺ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "xMinYMid"

    .line 556
    sget-object v2, Ll/֫֡ܺ;->ۨ:Ll/֫֡ܺ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "xMidYMid"

    .line 557
    sget-object v2, Ll/֫֡ܺ;->۫:Ll/֫֡ܺ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "xMaxYMid"

    .line 558
    sget-object v2, Ll/֫֡ܺ;->ۙ:Ll/֫֡ܺ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "xMinYMax"

    .line 559
    sget-object v2, Ll/֫֡ܺ;->ۛ:Ll/֫֡ܺ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "xMidYMax"

    .line 560
    sget-object v2, Ll/֫֡ܺ;->۬:Ll/֫֡ܺ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "xMaxYMax"

    .line 561
    sget-object v2, Ll/֫֡ܺ;->᩶:Ll/֫֡ܺ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/֫֡ܺ;
    .locals 1

    .line 565
    sget-object v0, Ll/֡֨ܺ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫֡ܺ;

    return-object p0
.end method
