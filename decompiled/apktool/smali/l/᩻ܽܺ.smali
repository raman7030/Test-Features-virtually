.class public abstract Ll/᩻ܽܺ;
.super Ljava/lang/Object;
.source "NBA1"

# interfaces
.implements Ll/۫ᩳܺ;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 41
    iput-object p1, p0, Ll/᩻ܽܺ;->֫:Ljava/lang/String;

    return-void

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "name == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/᩻ܽܺ;->֫:Ljava/lang/String;

    return-object v0
.end method
