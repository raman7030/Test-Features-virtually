.class public final Ll/ۢ֫ܽ;
.super Ljava/lang/Object;
.source "F6YU"


# static fields
.field public static final ֫:Ll/ۤ۟ۧ;

.field public static final ۧ:Ll/۫۟ۧ;

.field public static final ܽ:Ll/᩶۟ۧ;

.field public static final ᩳ:Ll/᩶۟ۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 80
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "VISUAL_STATE_CALLBACK"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "OFF_SCREEN_PRERASTER"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    new-instance v0, Ll/ۙ۟ۧ;

    const-string v1, "SAFE_BROWSING_ENABLE"

    .line 160
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    new-instance v0, Ll/᩹۟ۧ;

    const-string v1, "DISABLED_ACTION_MODE_MENU_ITEMS"

    .line 145
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    new-instance v0, Ll/ۗ۟ۧ;

    const-string v1, "START_SAFE_BROWSING"

    .line 175
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    new-instance v0, Ll/ۗ۟ۧ;

    const-string v1, "SAFE_BROWSING_WHITELIST"

    .line 175
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    new-instance v0, Ll/ۗ۟ۧ;

    const-string v2, "SAFE_BROWSING_ALLOWLIST"

    .line 175
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    new-instance v0, Ll/ۗ۟ۧ;

    .line 175
    invoke-direct {v0, v2, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    new-instance v0, Ll/ۗ۟ۧ;

    .line 175
    invoke-direct {v0, v2, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    new-instance v0, Ll/ۗ۟ۧ;

    const-string v1, "SAFE_BROWSING_PRIVACY_POLICY_URL"

    .line 175
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    new-instance v0, Ll/᩹۟ۧ;

    const-string v1, "SERVICE_WORKER_BASIC_USAGE"

    .line 145
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    new-instance v0, Ll/᩹۟ۧ;

    const-string v1, "SERVICE_WORKER_CACHE_MODE"

    .line 145
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    new-instance v0, Ll/᩹۟ۧ;

    const-string v1, "SERVICE_WORKER_CONTENT_ACCESS"

    .line 145
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    new-instance v0, Ll/᩹۟ۧ;

    const-string v1, "SERVICE_WORKER_FILE_ACCESS"

    .line 145
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    new-instance v0, Ll/᩹۟ۧ;

    const-string v1, "SERVICE_WORKER_BLOCK_NETWORK_LOADS"

    .line 145
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    new-instance v0, Ll/᩹۟ۧ;

    const-string v1, "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"

    .line 145
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "RECEIVE_WEB_RESOURCE_ERROR"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "RECEIVE_HTTP_ERROR"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    new-instance v0, Ll/᩹۟ۧ;

    const-string v1, "SHOULD_OVERRIDE_WITH_REDIRECTS"

    .line 145
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    new-instance v0, Ll/ۗ۟ۧ;

    const-string v1, "SAFE_BROWSING_HIT"

    .line 175
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    new-instance v0, Ll/᩹۟ۧ;

    const-string v1, "WEB_RESOURCE_REQUEST_IS_REDIRECT"

    .line 145
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "WEB_RESOURCE_ERROR_GET_DESCRIPTION"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "WEB_RESOURCE_ERROR_GET_CODE"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    new-instance v0, Ll/ۗ۟ۧ;

    const-string v1, "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY"

    .line 175
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    new-instance v0, Ll/ۗ۟ۧ;

    const-string v1, "SAFE_BROWSING_RESPONSE_PROCEED"

    .line 175
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    new-instance v0, Ll/ۗ۟ۧ;

    const-string v1, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"

    .line 175
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "WEB_MESSAGE_PORT_POST_MESSAGE"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "WEB_MESSAGE_PORT_CLOSE"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "WEB_MESSAGE_ARRAY_BUFFER"

    .line 115
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "CREATE_WEB_MESSAGE_CHANNEL"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "POST_WEB_MESSAGE"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    new-instance v0, Ll/᩸۟ۧ;

    const-string v1, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    .line 130
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    new-instance v0, Ll/ۙ۟ۧ;

    const-string v1, "GET_WEB_VIEW_CLIENT"

    .line 160
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    new-instance v0, Ll/ۙ۟ۧ;

    const-string v1, "GET_WEB_CHROME_CLIENT"

    .line 160
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    new-instance v0, Ll/۫۟ۧ;

    const-string v1, "GET_WEB_VIEW_RENDERER"

    .line 205
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    new-instance v0, Ll/۫۟ۧ;

    const-string v1, "WEB_VIEW_RENDERER_TERMINATE"

    .line 205
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    new-instance v0, Ll/۬۟ۧ;

    const-string v1, "TRACING_CONTROLLER_BASIC_USAGE"

    .line 190
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    new-instance v0, Ll/ܽ֫ܽ;

    .line 169
    invoke-direct {v0}, Ll/ᩳ֫ܽ;-><init>()V

    .line 406
    new-instance v0, Ll/ۧ֫ܽ;

    .line 183
    invoke-direct {v0}, Ll/ᩳ֫ܽ;-><init>()V

    .line 416
    new-instance v0, Ll/ۧ֫ܽ;

    .line 183
    invoke-direct {v0}, Ll/ᩳ֫ܽ;-><init>()V

    .line 428
    new-instance v0, Ll/۫۟ۧ;

    const-string v1, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    .line 205
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    new-instance v0, Ll/᩻֫ܽ;

    invoke-direct {v0}, Ll/᩻֫ܽ;-><init>()V

    sput-object v0, Ll/ۢ֫ܽ;->֫:Ll/ۤ۟ۧ;

    .line 463
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "PROXY_OVERRIDE"

    const-string v2, "PROXY_OVERRIDE:3"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "MULTI_PROCESS"

    const-string v2, "MULTI_PROCESS_QUERY"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    sput-object v0, Ll/ۢ֫ܽ;->ᩳ:Ll/᩶۟ۧ;

    .line 478
    new-instance v0, Ll/۫۟ۧ;

    const-string v1, "FORCE_DARK"

    .line 205
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 478
    sput-object v0, Ll/ۢ֫ܽ;->ۧ:Ll/۫۟ۧ;

    .line 486
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "FORCE_DARK_STRATEGY"

    const-string v2, "FORCE_DARK_BEHAVIOR"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    sput-object v0, Ll/ۢ֫ܽ;->ܽ:Ll/᩶۟ۧ;

    .line 495
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "WEB_MESSAGE_LISTENER"

    .line 115
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "DOCUMENT_START_SCRIPT"

    const-string v2, "DOCUMENT_START_SCRIPT:1"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "PROXY_OVERRIDE_REVERSE_BYPASS"

    .line 115
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 521
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "GET_VARIATIONS_HEADER"

    .line 115
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"

    .line 115
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 538
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "GET_COOKIE_INFO"

    .line 115
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 549
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "REQUESTED_WITH_HEADER_ALLOW_LIST"

    .line 115
    invoke-direct {v0, v1, v1}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "USER_AGENT_METADATA"

    const-string v2, "USER_AGENT_METADATA"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    new-instance v0, Ll/ۜ֫ܽ;

    const-string v1, "MULTI_PROFILE"

    const-string v2, "MULTI_PROFILE"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "ATTRIBUTION_REGISTRATION_BEHAVIOR"

    const-string v2, "ATTRIBUTION_BEHAVIOR"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "WEBVIEW_MEDIA_INTEGRITY_API_STATUS"

    const-string v2, "WEBVIEW_INTEGRITY_API_STATUS"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "MUTE_AUDIO"

    const-string v2, "MUTE_AUDIO"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 627
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "WEB_AUTHENTICATION"

    const-string v2, "WEB_AUTHENTICATION"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 636
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "SPECULATIVE_LOADING_STATUS"

    const-string v2, "SPECULATIVE_LOADING"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 646
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "BACK_FORWARD_CACHE"

    const-string v2, "BACK_FORWARD_CACHE"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 651
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "DELETE_BROWSING_DATA"

    const-string v2, "WEB_STORAGE_DELETE_BROWSING_DATA"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    new-instance v0, Ll/᩷֫ܽ;

    const-string v1, "PREFETCH_URL_V4"

    const-string v2, "PREFETCH_URL_V4"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 682
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "IMPLEMENTATION_ONLY_FEATURE"

    const-string v2, "ASYNC_WEBVIEW_STARTUP"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 690
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "DEFAULT_TRAFFICSTATS_TAGGING"

    const-string v2, "DEFAULT_TRAFFICSTATS_TAGGING"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "PRERENDER_URL_V2"

    const-string v2, "PRERENDER_URL_V2"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 708
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "SPECULATIVE_LOADING_CONFIG_V2"

    const-string v2, "SPECULATIVE_LOADING_CONFIG_V2"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 716
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "SAVE_STATE"

    const-string v2, "SAVE_STATE"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 726
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE"

    const-string v2, "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 734
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "CACHE_PROVIDER"

    const-string v2, "PROVIDER_WEAKLY_REF_WEBVIEW"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 744
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "PAYMENT_REQUEST"

    const-string v2, "PAYMENT_REQUEST"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 757
    new-instance v0, Ll/᩶۟ۧ;

    const-string v1, "WEBVIEW_BUILDER"

    const-string v2, "WEBVIEW_BUILDER"

    .line 115
    invoke-direct {v0, v1, v2}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
