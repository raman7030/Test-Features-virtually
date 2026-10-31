.class public Ll/᩻ܰۖ;
.super Ll/ۢܰۖ;
.source "E9ZE"


# static fields
.field public static ܽ:Ljava/util/EnumSet;


# instance fields
.field public ֫:Ljava/util/Set;

.field public ۧ:Ll/᩵ܰۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 25
    sget-object v0, Ll/᩷ܰۖ;->ܰ:Ll/᩷ܰۖ;

    sget-object v1, Ll/᩷ܰۖ;->ܿ֫:Ll/᩷ܰۖ;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Ll/᩻ܰۖ;->ܽ:Ljava/util/EnumSet;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Ll/᩵ܰۖ;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ܰۖ;->֫:Ljava/util/Set;

    .line 34
    sget-object v0, Ll/᩻ܰۖ;->ܽ:Ljava/util/EnumSet;

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 35
    iput-object p2, p0, Ll/᩻ܰۖ;->ۧ:Ll/᩵ܰۖ;

    return-void
.end method
