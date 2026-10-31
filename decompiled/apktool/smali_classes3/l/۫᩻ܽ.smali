.class public interface abstract Ll/۫᩻ܽ;
.super Ljava/lang/Object;
.source "I59Q"


# static fields
.field public static final ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 6
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۫᩻ܽ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract getItem(I)Ll/ۗ᩻ܽ;
.end method

.method public abstract size()I
.end method

.method public abstract ֫(I)Ll/ۗ᩻ܽ;
.end method

.method public abstract ֫()Z
.end method
