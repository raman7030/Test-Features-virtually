.class public final Ll/᩵ܳۖ;
.super Ljava/lang/Object;
.source "H88J"


# static fields
.field public static final ܽ:Ll/᩵ܳۖ;


# instance fields
.field public final ֫:Ljava/util/Map;

.field public final ۧ:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 289
    new-instance v0, Ll/᩵ܳۖ;

    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v0, v2, v1}, Ll/᩵ܳۖ;-><init>(Ljava/util/List;Ljava/util/Map;)V

    sput-object v0, Ll/᩵ܳۖ;->ܽ:Ll/᩵ܳۖ;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/Map;)V
    .locals 0

    .line 296
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 297
    iput-object p2, p0, Ll/᩵ܳۖ;->֫:Ljava/util/Map;

    .line 298
    iput-object p1, p0, Ll/᩵ܳۖ;->ۧ:Ljava/util/List;

    return-void
.end method
