.class public abstract Ll/ᩳ֫ܽ;
.super Ljava/lang/Object;
.source "Z6ZY"


# static fields
.field public static final ֫:Ljava/util/HashSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 60
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Ll/ᩳ֫ܽ;->֫:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    sget-object v0, Ll/ᩳ֫ܽ;->֫:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method
