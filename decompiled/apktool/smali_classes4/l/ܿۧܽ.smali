.class public final Ll/ܿۧܽ;
.super Ljava/lang/Object;
.source "FALT"


# static fields
.field public static final ۧ:Ll/ܿۧܽ;

.field public static final ܽ:Ll/ܿۧܽ;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 98
    new-instance v0, Ll/ܿۧܽ;

    const-string v1, "FLAT"

    invoke-direct {v0, v1}, Ll/ܿۧܽ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ܿۧܽ;->ۧ:Ll/ܿۧܽ;

    .line 108
    new-instance v0, Ll/ܿۧܽ;

    const-string v1, "HALF_OPENED"

    invoke-direct {v0, v1}, Ll/ܿۧܽ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ܿۧܽ;->ܽ:Ll/ܿۧܽ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۧܽ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ܿۧܽ;->֫:Ljava/lang/String;

    return-object v0
.end method
