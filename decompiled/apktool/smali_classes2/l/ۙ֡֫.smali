.class public final Ll/ۙ֡֫;
.super Ljava/lang/Object;
.source "G8LM"


# static fields
.field public static final ۧ:Ll/ۤۤܺ;

.field public static final ܽ:Ll/ۙ֡֫;


# instance fields
.field public final ֫:Ll/ܳ۬ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 35
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v0

    new-instance v1, Ll/۟ۤ᩻;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ll/ۤۤܺ;->֫(Ll/ܽܶܺ;)Ll/ۤۤܺ;

    move-result-object v0

    sput-object v0, Ll/ۙ֡֫;->ۧ:Ll/ۤۤܺ;

    .line 39
    new-instance v0, Ll/ۙ֡֫;

    .line 40
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۙ֡֫;-><init>(Ljava/util/List;)V

    sput-object v0, Ll/ۙ֡֫;->ܽ:Ll/ۙ֡֫;

    const/4 v0, 0x0

    .line 66
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x1

    .line 67
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    sget-object v0, Ll/ۙ֡֫;->ۧ:Ll/ۤۤܺ;

    invoke-static {v0, p1}, Ll/ܳ۬ܺ;->֫(Ljava/util/Comparator;Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ۙ֡֫;->֫:Ll/ܳ۬ܺ;

    return-void
.end method
