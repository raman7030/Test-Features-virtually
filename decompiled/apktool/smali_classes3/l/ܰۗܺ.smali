.class public final Ll/ܰۗܺ;
.super Ljava/lang/Object;
.source "A5TB"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:Ljava/util/EnumSet;


# direct methods
.method public constructor <init>(Ljava/util/EnumSet;)V
    .locals 0

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    iput-object p1, p0, Ll/ܰۗܺ;->᩸:Ljava/util/EnumSet;

    return-void
.end method


# virtual methods
.method public readResolve()Ljava/lang/Object;
    .locals 3

    .line 151
    new-instance v0, Ll/۟ۗܺ;

    iget-object v1, p0, Ll/ܰۗܺ;->᩸:Ljava/util/EnumSet;

    invoke-virtual {v1}, Ljava/util/EnumSet;->clone()Ljava/util/EnumSet;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/۟ۗܺ;-><init>(Ljava/util/EnumSet;I)V

    return-object v0
.end method
