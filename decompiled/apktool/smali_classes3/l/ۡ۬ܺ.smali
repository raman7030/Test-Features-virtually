.class public final Ll/ۡ۬ܺ;
.super Ljava/lang/Object;
.source "V656"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:Ll/ۢ۬ܺ;


# direct methods
.method public constructor <init>(Ll/ۢ۬ܺ;)V
    .locals 0

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    iput-object p1, p0, Ll/ۡ۬ܺ;->᩸:Ll/ۢ۬ܺ;

    return-void
.end method


# virtual methods
.method public readResolve()Ljava/lang/Object;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ۡ۬ܺ;->᩸:Ll/ۢ۬ܺ;

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->entrySet()Ll/ۛ۬ܺ;

    move-result-object v0

    return-object v0
.end method
