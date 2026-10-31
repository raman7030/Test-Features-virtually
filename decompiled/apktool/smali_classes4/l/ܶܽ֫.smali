.class public abstract Ll/ܶܽ֫;
.super Ljava/lang/Object;
.source "NB43"


# instance fields
.field public final mPropertyName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Ll/ܶܽ֫;->mPropertyName:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Landroid/util/FloatProperty;)Ll/ܶܽ֫;
    .locals 2

    .line 58
    new-instance v0, Ll/۠ܽ֫;

    invoke-virtual {p0}, Landroid/util/FloatProperty;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ll/۠ܽ֫;-><init>(Ljava/lang/String;Landroid/util/FloatProperty;)V

    return-object v0
.end method


# virtual methods
.method public abstract getValue(Ljava/lang/Object;)F
.end method

.method public abstract setValue(Ljava/lang/Object;F)V
.end method
