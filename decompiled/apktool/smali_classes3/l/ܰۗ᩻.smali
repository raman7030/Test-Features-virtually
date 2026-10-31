.class public final Ll/ܰۗ᩻;
.super Ljava/lang/Object;
.source "D7B1"


# instance fields
.field public final ֫:Ljava/lang/Exception;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/lang/Exception;)V
    .locals 0

    .line 434
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 435
    iput-object p1, p0, Ll/ܰۗ᩻;->ۧ:Ljava/util/ArrayList;

    .line 436
    iput-object p2, p0, Ll/ܰۗ᩻;->֫:Ljava/lang/Exception;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰۗ᩻;)Ljava/lang/Exception;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۗ᩻;->֫:Ljava/lang/Exception;

    return-object p0
.end method

.method public static ֫(Ljava/lang/Exception;)Ll/ܰۗ᩻;
    .locals 2

    .line 450
    new-instance v0, Ll/ܰۗ᩻;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1, p0}, Ll/ܰۗ᩻;-><init>(Ljava/util/ArrayList;Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/ArrayList;)Ll/ܰۗ᩻;
    .locals 2

    .line 443
    new-instance v0, Ll/ܰۗ᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ܰۗ᩻;-><init>(Ljava/util/ArrayList;Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/ܰۗ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۗ᩻;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method
