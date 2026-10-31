.class public abstract Ll/۠۫ۘ;
.super Ljava/lang/Object;
.source "U4HR"


# instance fields
.field public final ֫:Ll/֨۫ۘ;


# direct methods
.method public constructor <init>(Ll/֨۫ۘ;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/۠۫ۘ;->֫:Ll/֨۫ۘ;

    return-void
.end method

.method public static ֫(Ljava/lang/StringBuilder;)V
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 33
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method


# virtual methods
.method public abstract ֫()Ll/۠۫ۘ;
.end method
