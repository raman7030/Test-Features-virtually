.class public abstract Ll/ۧ֨ᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final a:Ll/ۢ֨ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 71
    new-instance v0, Ll/ۢ֨ᩴ;

    const-string v1, "user.dir"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۢ֨ᩴ;-><init>(Ljava/lang/String;)V

    .line 38
    sput-object v0, Ll/ۧ֨ᩴ;->a:Ll/ۢ֨ᩴ;

    return-void
.end method
