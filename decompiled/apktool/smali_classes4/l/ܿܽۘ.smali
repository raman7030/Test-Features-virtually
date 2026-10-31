.class public final Ll/ܿܽۘ;
.super Ljava/lang/Object;
.source "V9DJ"


# static fields
.field public static final ۧ:Ll/֫᩻֨;


# instance fields
.field public ֫:Lnet/engio/mbassy/bus/SyncMessageBus;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 31
    const-class v0, Ll/ܿܽۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܿܽۘ;->ۧ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 36
    new-instance v0, Lnet/engio/mbassy/bus/SyncMessageBus;

    new-instance v1, Ll/ᩳܽۘ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lnet/engio/mbassy/bus/SyncMessageBus;-><init>(Lnet/engio/mbassy/bus/error/IPublicationErrorHandler;)V

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object v0, p0, Ll/ܿܽۘ;->֫:Lnet/engio/mbassy/bus/SyncMessageBus;

    return-void
.end method

.method public static bridge synthetic ֫()Ll/֫᩻֨;
    .locals 1

    .line 0
    sget-object v0, Ll/ܿܽۘ;->ۧ:Ll/֫᩻֨;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/AutoCloseable;)V
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ܿܽۘ;->֫:Lnet/engio/mbassy/bus/SyncMessageBus;

    invoke-interface {v0, p1}, Lnet/engio/mbassy/bus/common/PubSubSupport;->subscribe(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ܽܽۘ;)V
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ܿܽۘ;->֫:Lnet/engio/mbassy/bus/SyncMessageBus;

    invoke-interface {v0, p1}, Lnet/engio/mbassy/bus/common/PubSubSupport;->publish(Ljava/lang/Object;)Lnet/engio/mbassy/bus/IMessagePublication;

    return-void
.end method
