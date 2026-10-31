.class public final Ll/᩹᩺ۚ;
.super Ljava/lang/Object;
.source "I7D8"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/HashMap;

.field public static final ܽ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 47
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x12d

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/᩹᩺ۚ;->ۧ:Ljava/util/HashMap;

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/᩹᩺ۚ;->ܽ:Ljava/util/HashMap;

    .line 52
    invoke-static {}, Ll/ܶ᩺ۚ;->values()[Ll/ܶ᩺ۚ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 59
    sget-object v4, Ll/᩹᩺ۚ;->ۧ:Ljava/util/HashMap;

    invoke-static {v3}, Ll/ܶ᩺ۚ;->ܽ(Ll/ܶ᩺ۚ;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v4, Ll/᩹᩺ۚ;->ܽ:Ljava/util/HashMap;

    invoke-static {v3}, Ll/ܶ᩺ۚ;->ۧ(Ll/ܶ᩺ۚ;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    invoke-static {v3}, Ll/ܶ᩺ۚ;->֫(Ll/ܶ᩺ۚ;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 62
    invoke-static {v3}, Ll/ܶ᩺ۚ;->֫(Ll/ܶ᩺ۚ;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(Ljava/lang/Integer;)Ll/ܶ᩺ۚ;
    .locals 1

    .line 71
    sget-object v0, Ll/᩹᩺ۚ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶ᩺ۚ;

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ܶ᩺ۚ;
    .locals 1

    .line 67
    sget-object v0, Ll/᩹᩺ۚ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶ᩺ۚ;

    return-object p0
.end method
