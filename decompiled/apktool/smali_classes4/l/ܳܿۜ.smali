.class public final Ll/ܳܿۜ;
.super Ljava/lang/Object;
.source "L78E"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/Throwable;

.field public final ܽ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;Ljava/lang/Throwable;)V
    .locals 0

    .line 1940
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1941
    iput p1, p0, Ll/ܳܿۜ;->֫:I

    .line 1942
    iput-object p2, p0, Ll/ܳܿۜ;->ܽ:Ljava/util/ArrayList;

    .line 1943
    iput-object p3, p0, Ll/ܳܿۜ;->ۧ:Ljava/lang/Throwable;

    return-void
.end method

.method public static ֫(ILjava/lang/Throwable;)Ll/ܳܿۜ;
    .locals 2

    .line 1957
    new-instance v0, Ll/ܳܿۜ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Ll/ܳܿۜ;-><init>(ILjava/util/ArrayList;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/ArrayList;I)Ll/ܳܿۜ;
    .locals 2

    .line 1950
    new-instance v0, Ll/ܳܿۜ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Ll/ܳܿۜ;-><init>(ILjava/util/ArrayList;Ljava/lang/Throwable;)V

    return-object v0
.end method
