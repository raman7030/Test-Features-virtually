.class public Lnet/engio/mbassy/bus/config/ConfigurationError;
.super Ljava/lang/RuntimeException;
.source "ConfigurationError.java"


# instance fields
.field public message:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 15
    iput-object p1, p0, Lnet/engio/mbassy/bus/config/ConfigurationError;->message:Ljava/lang/String;

    return-void
.end method

.method public static MissingFeature(Ljava/lang/Class;)Lnet/engio/mbassy/bus/config/ConfigurationError;
    .locals 3

    .line 19
    new-instance v0, Lnet/engio/mbassy/bus/config/ConfigurationError;

    const-string v1, "The expected feature "

    const-string v2, " was missing. Use addFeature() in IBusConfiguration to add features."

    .line 0
    invoke-static {p0, v1, v2}, Ll/᩸ܳۡ;->֫(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Lnet/engio/mbassy/bus/config/ConfigurationError;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/ConfigurationError;->message:Ljava/lang/String;

    return-object v0
.end method
